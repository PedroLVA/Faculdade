const express = require('express');
const app = express();
const bodyParser = require('body-parser');

app.use(bodyParser.text());
app.use(bodyParser.json());


const Cliente = require('./BancoDeDados/Funcionario');


const cors = require('cors');
app.use(cors());

app.get('/cargos', Cliente.getCargos);


//Pedro Luiz Vidal Athayde - 236730
//Raphael Carneiro Gomes - 236721

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