const express = require('express');
const app = express();

var MongoClient = require('mongodb').MongoClient

var dbName = "cfg";
var url =  "mongodb://songenwang.com:27017";

app.get('/newhost', async (req, res) => {
    const client = new MongoClient(url);
    client.connect(function(err) {
        hUrl = "hangouts.google.com/p14c3h01d";//await generateHangoutsUrl();
        const db = client.db(dbName);
        db.collection("hosts").insert({
            "url": hUrl,
            "locations": {
                "lat": req.params.lat,
                "lng": req.params.lng,
            },
            "time": req.params.time,
            "active": true
        }).then( () => {
            return res.json({"sent":"True"})
        });
    })
});

/*
async function generateHangoutsUrl(){

}
*/

app.get('/hosts', async (req, res) => {
    const client = new MongoClient(url);
    client.connect(function(err) {
        const db = client.db(dbName);
        db.collection("hosts").find({"active":true}, function (err, doc) {
            doc.toArray( function(err, data){
                res.send(data);
            });
        });
        client.close();
    });
});

app.get('/newUser', async (req, res) => {
    const client = new MongoClient(url);
    client.connect(function(err) {
        const db = client.db(dbName);
        db.collection("users").insert(req.params.gval, function (err, doc) {
           if(err){
               console.log(err);
           } 
        });
        client.close();
    });
});

async function getUserIdPair(pair){
    return new Promise( async (resolve, reject) => {
        try {
            let u1 = pair.one;
            let u2 = pair.two;

            db.collections("users").findOne(pair.one).then( (doc) => {
                u1 = doc._id;
            });
            db.collections("users").findOne(pair.two).then( (doc) => {
                u2 = doc._id;
            })

            resolve({one:u1, two:u2});
        }
        catch(err){
            reject(err);
        }
    });
}

app.get('/user/addFriend/:friendID', async(req, res)  => {
    const client = new MongoClient(url);
    client.connect(async (err) => {
        const db = client.db(dbName);
        x = await getUserIdPair(req.params.userDiff);
        db.collections("friends").insert(x, function (err, doc) {
            if(err){
                console.log(err)
            }
        });
    })
});



app.get('/user/:id', function(req, res) { 
    const client = new MongoClient(url);
    client.connect(function(err) {
        const db = client.db(dbName);
        db.collections("users").findOne(req.params.id).then( (doc) => {
            return res.send(doc);
        })
    })
});

app.get('/', function (req, res) {
    return res.send('{"return":"none"}');
});

app.listen(process.env.PORT || 8080);
