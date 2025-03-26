const express = require('express');
const app = express();
const bodyParser = require('body-parser');

app.use(bodyParser.text());
app.use(bodyParser.json());


const bancoAC1 = require('./BancoDeDados/AC1');


const cors = require('cors');
app.use(cors());

app.get('/cargos', bancoAC1.getCargos);


//Pedro Luiz Vidal Athayde - 236730
//Raphael Carneiro Gomes - 236721

//gets
app.get('/setores', bancoAC1.getSetores);

app.get('/funcionarios', bancoAC1.getFuncionarios);

app.get('/setoresParam', bancoAC1.getSetorNome);

app.get('/funcionarios/:id', bancoAC1.getFuncionariosId);

app.post('/funcionarios/cargo', bancoAC1.getFuncionariosCargo); //Não da pra passar passar informação no body em uma requisição get

app.get('/cargo/semFuncionario', bancoAC1.getCargosSemFuncionario);


//

app.post('/funcionario', bancoAC1.postFuncionario);

app.put('/funcionario/:id', bancoAC1.putFuncionario);

app.delete('/funcionario/:id', bancoAC1.deleteFuncionario);


app.listen(3000, () => {
    console.log('Servidor rodando na porta 3000');
});