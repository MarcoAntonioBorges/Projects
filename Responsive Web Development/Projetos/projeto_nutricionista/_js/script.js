/*var table = document.querySelector(".section-table");

var pesos = document.querySelectorAll(".peso");
var alturas = document.querySelectorAll(".altura");

var imcs = document.querySelectorAll(".imc");


for (var i = 0; i < alturas.length; i++) {

	var contentPeso = parseFloat(pesos[i].textContent);
	var contentAltura = parseFloat(alturas[i].textContent);

	imcs[i].textContent = (contentPeso / (contentAltura * contentAltura)).toFixed(2);

	calcImc(imcs[i]);

}


var botao = document.querySelector("#submit_cadastro");

botao.addEventListener('click', function(){
	addPaciente();
});



// Methods
function calcImc(imc){
	if(imc.textContent < 25){
		imc.classList.add("imc_baixo");
	}else{
		imc.classList.add("imc_alto");
	}
}

function addPaciente(){
	var form = document.querySelector("#cadastroPaciente");
	console.log(form);
	var table = document.querySelector(".table");
	var tBody = document.querySelector('tbody');
	
	var linha = document.querySelectorAll(".table-item-id");

	var id = linha.length + 1;
	var nome = document.querySelector("#nome").value;
	var data = document.querySelector("#data").value;
	var peso = document.querySelector("#peso").value;
	var altura = document.querySelector("#altura").value;

	var trPaciente = document.createElement("tr");
	trPaciente.classList.add('dados');

	var tdId = document.createElement("td");
	tdId.classList.add('table-item-id');
	tdId.textContent = id;

	var tdNome = document.createElement("td");
	tdNome.textContent = nome;

	var tdData = document.createElement("td");
	tdData.textContent = data;

	var tdPeso = document.createElement("td");
	tdPeso.textContent = parseFloat(peso);

	var tdAltura = document.createElement("td");
	tdAltura.textContent = altura;



	var tdImc = document.createElement("td");
	tdImc.textContent = (parseFloat(tdPeso.textContent) / parseFloat((tdAltura.textContent * tdAltura.textContent))).toFixed(2);

	if((peso < 0 || peso > 480) || (altura < 0 || altura > 2.80)){
		alert("Dados errados!!");
	}else{
		trPaciente.appendChild(tdId);
		trPaciente.appendChild(tdNome);
		trPaciente.appendChild(tdData);
		trPaciente.appendChild(tdPeso);
		trPaciente.appendChild(tdAltura);
		trPaciente.appendChild(tdImc);

		calcImc(tdImc);

		tBody.appendChild(trPaciente);
		
	}
	form.reset();
}*/

/*  */
var list = document.querySelectorAll('.dados');
console.log(list);

list.forEach( function(paciente) {
	console.log(paciente);

	var erros = validarPaciente(paciente);
	if(erros.length > 0){
		mostrarErros(erros);
	}

		/* Pegando o obj do html */
	var tdPeso = paciente.querySelector('.peso');
	var tdAltura = paciente.querySelector('.altura');

	// /* Pegando o conteudo do obj */
	var peso = parseFloat(tdPeso.textContent);
	var altura = parseFloat(tdAltura.textContent);

	// /* Pegando o obj do html -> IMC */
	var tdImc = paciente.querySelector(".imc");

	tdImc.textContent = (peso / (altura * altura)).toFixed(2);

});

// for (var i = 0; i < list.length; i++){
	/* Percorrendo a lista de pacientes */
	// var paciente = list[i];

	/* Pegando o obj do html */
	// var tdPeso = paciente.querySelector('.peso');
	// var tdAltura = paciente.querySelector('.altura');

	/* Pegando o conteudo do obj */
	// var peso = parseFloat(tdPeso.textContent);
	// var altura = parseFloat(tdAltura.textContent);

	/* Pegando o obj do html -> IMC */
	// var tdImc = paciente.querySelector(".imc");

	// tdImc.textContent = (peso / (altura * altura)).toFixed(2);
// }
	


/* Validando o formulario paciente */

function validarPaciente(paciente){
	var erros = [];

	/* Pegando o obj do html */
	var tdPeso = paciente.querySelector('.peso');
	var tdAltura = paciente.querySelector('.altura');

	/* Pegando o conteudo do obj */
	var peso = parseFloat(tdPeso.textContent);
	var altura = parseFloat(tdAltura.textContent);

	if (peso > 30) {
		erros.push("Ta pesado");
	}else{
		erros.push("Ta Leve");
	}
}

/* Mostrando a mensagem de erros */
function mostrarErros(erros){
	var ul = document.querySelector("#msg_error");

	

	erros.forEach(function(erro){
		var li = document.createElement("li");
		li.textContent = erro;

		/* "Setando" valores dentro da UL (lista) */
		ul.appendChild(li);

	});



}