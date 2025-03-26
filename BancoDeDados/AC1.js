//método de conexão com o banco de dados mysql
//Pedro Luiz Vidal Athayde - 236730
//Raphael Carneiro Gomes - 236721
async function connect() {
    const mysql = require('mysql2/promise');
    if (global.connection && global.connection.state !== 'disconnected')
        return global.connection;

    const connection = await mysql.createConnection({
        host: 'localhost',
        user: 'root',
        password: 'usbw',
        database: 'rhac1',
        port: 3308
    })
    console.log('Conectou no MySQL');
    global.connection = connection;
    return connection;
}

connect();

async function getCargos(req, res) {
    const conn = await connect();
    const cargo = await conn.query('SELECT * FROM cargo');
    console.log(cargo[0]);
    res.send(cargo[0]);
}

async function getSetores(req, res) {
    const conn = await connect();
    const setores = await conn.query('SELECT * FROM setor');
    console.log(setores[0]);
    res.send(setores[0]);
}

async function getFuncionarios(req, res) {
    const conn = await connect();
    const funcionarios = await conn.query('SELECT * FROM funcionario');
    console.log(funcionarios[0]);
    res.send(funcionarios[0]);
}

async function getSetorNome(req, res) {
    const conn = await connect();
    let nome = req.query.nome;
    const setores = await conn.query('SELECT * FROM setor WHERE nome = ?', nome);
    res.send(setores[0]);
}

async function getFuncionariosId(req, res) {
    const conn = await connect();
    let id = req.params.id;
    const funcionario = await conn.query('SELECT * FROM funcionario WHERE cod_funcionario = ?', id);
    res.send(funcionario[0]);
}

async function getFuncionariosCargo(req, res) {
    const conn = await connect();
    let cargo = req.body.cargo;
    const funcionarios = await conn.query("SELECT f. * FROM funcionario f INNER JOIN cargo c ON f.cod_cargo = c.cod_cargo WHERE c.nome = ?", cargo);
    res.send(funcionarios[0]);
}

async function getFuncionariosCargo(req, res) {
    const conn = await connect();
    let cargo = req.body.cargo;
    const funcionarios = await conn.query("SELECT f. * FROM funcionario f INNER JOIN cargo c ON f.cod_cargo = c.cod_cargo WHERE c.nome = ?", cargo);
    res.send(funcionarios[0]);
}

async function getCargosSemFuncionario(req, res) {
    const conn = await connect();
    const funcionarios = await conn.query("SELECT c . * FROM cargo c LEFT JOIN funcionario f ON f.cod_cargo = c.cod_cargo WHERE f.cod_cargo IS NULL");
    res.send(funcionarios[0]);
}

async function postFuncionario(req, res) {
    const conn = await connect();
    const { nome, data_admissao, cod_cargo, cod_setor } = req.body;
    if (!nome)
        return res.status(400).send('Nome é obrigatorio');
    const result = await conn.query('INSERT INTO funcionario (nome, data_admissao, cod_cargo, cod_setor) VALUES (?, ?, ?, ?)',
        [nome, data_admissao, cod_cargo, cod_setor]);
    console.log(result);
    res.send("Funcionario cadastrado com sucesso!");
}


async function putFuncionario(req, res) {
    const conn = await connect();
    let id = req.params.id; // ID do funcionário a ser atualizado
    const { nome, data_admissao, cod_cargo, cod_setor } = req.body;

    const result = await conn.query(
        'UPDATE funcionario SET nome = ?, data_admissao = ?, cod_cargo = ?, cod_setor = ? WHERE cod_funcionario = ?',
        [nome, data_admissao, cod_cargo, cod_setor, id]
    );

    if (result.affectedRows === 0) {
        return res.status(404).send('Funcionário não encontrado');
    }

    res.send("Funcionario atualizado com sucesso!");
}

async function deleteFuncionario(req, res) {
    const conn = await connect();
    let id = req.params.id;
    const result = await conn.query('delete from funcionario where cod_funcionario = ?', [id])
    res.send("Funcionario deletado com sucesso!")
}


module.exports = { getCargos, getSetores, getFuncionarios, getFuncionariosId, getFuncionariosCargo, getCargosSemFuncionario, getSetorNome, postFuncionario, putFuncionario, deleteFuncionario };