const express = require('express');
const app = express();
const bodyParser = require('body-parser');

app.use(bodyParser.text());
app.use(bodyParser.json());

//conexão com o banco de dados
const Cliente = require('./BancoDeDados/Cliente');

//configurar o CORS
const cors = require('cors');
app.use(cors());

app.get('/cargos', Cliente.getCargos);


//gets
app.get('/setores', Cliente.getSetores);

app.get('/funcionarios', Cliente.getFuncionarios);

app.get('/setoresParam', Cliente.getSetorNome);

app.get('/funcionarios/:id', Cliente.getFuncionariosId);

app.post('/funcionarios/cargo', Cliente.getFuncionariosCargo); //Não da pra passar um get com parametro no body

app.get('/cargo/semFuncionario', Cliente.getCargosSemFuncionario);


//post


app.post('/funcionario', Cliente.postFuncionario);

app.put('/funcionario/:id', Cliente.putFuncionario);

app.delete('/funcionario/:id', Cliente.deleteFuncionario);


app.listen(3000, () => {
    console.log('Servidor rodando na porta 3000');
});