const express = require('express');
const app = express();

var router = express.Router()

router.get('/hosts', async (req, res) => {

});

router.get('/:id', function(req, res) { });

app.get('/', function (req, res) {
 return res.send('{"return":"none"}');
});

app.listen(process.env.PORT || 8080);
