const http = require('http');
const fs = require('fs');
const url = require('url');

const server = http.createServer(function(req,res){
    var r = url.parse(req.url,true);
    var filename = "."+r.pathname;
   fs.readFile(filename, function(err,data){
         if(err){
             res.writeHead(404, {'Content-type':'text/plain'});
             return res.end("404");        
         }
         res.writeHead(200, {'Content-type':'text/plain'});
         return res.end("fhka");  
         
    });
}).listen(1000,()=>console.log('Port 1000 ...'));
