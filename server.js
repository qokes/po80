const express = require('express');
const cors = require('cors');
const path = require('path');
const app = express();

app.use(cors());
app.use(express.json());

let db = {};
let logueado = false;

app.post('/api/login', (req,res)=>{
  const {u,p} = req.body;
  if(u==="1971" && p==="1971"){
    logueado=true;
    res.json({ok:true, marca:"PO80"});
  } else {
    res.json({ok:false, msg:"Error, usa 1971 / 1971"});
  }
});

app.post('/api/guardar', (req,res)=>{
  const {id, data} = req.body;
  db[id] = { id, data, fecha: new Date().toISOString() };
  res.json({ok:true, guardado: db[id]});
});

app.get('/api/todo', (req,res)=>{
  res.json(db);
});

app.use(express.static('public'));

const PORT = process.env.PORT || 3000;
app.listen(PORT, ()=>console.log("PO80.COM corriendo"));
