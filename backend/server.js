const express = require('express');
const app = express();

var MongoClient = require('mongodb').MongoClient

var dbName = "cfg";
var url =  "mongodb://songenwang.com:27017";

app.get('/newhost', async (req, res) => {
    const client = new MongoClient(url);
    client.connect(function(err) {
        const db = client.db(dbName);
        db.collection("hosts").insert({
            url: generateHangoutsUrl(),
            locations: {
                lat: req.params.lat,
                lng: req.params.lng
            },
            Time: req.params.time
        })
    })
});

app.get('/hosts', async (req, res) => {
    const client = new MongoClient(url);
    client.connect(function(err) {
        const db = client.db(dbName);
        db.collection("hosts").find({time:"10/2/19 at 2:20pm"}, function (err, doc) {
            doc.toArray( function(err, data){
                console.log(data);
            });
        });
        client.close();
    });
});

app.get('/newUser', async (req, res) => {
    const client = new MongoClient(url);
    client.connect(function(err) {
        const db = client.db(dbName);
        db.collection("hosts").find({time:"10/2/19 at 2:20pm"}, function (err, doc) {
            doc.toArray( function(err, data){
                console.log(data);
            });
        });
        client.close();
    });
});

app.get('/user/:id', function(req, res) { 
    
    return res.send({"num":id});
});

app.get('/', function (req, res) {
 return res.send('{"return":"none"}');
});

app.listen(process.env.PORT || 8080);
