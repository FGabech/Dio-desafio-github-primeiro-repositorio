function operadores() {

    if (!n1 || !n2) return 'defina dois numeros';
    let n1 = Number(prompt ('Digite um número:'));
    let n2 = Number(prompt ('Digite um numero:'));
    let soma = n1+ n2;
    console.log(n1, n2);

    if (n1 === n2 && soma >20){
        alert(`Os números são iguais! A sua soma é ${soma} e é maior que 20`);
    }else if (n1 === n2 && soma <10){
        alert(`Os números são iguais! A sua soma é ${soma} e é menor que 10`)
    }else if (n1 !== n2 && soma < 10){
        alert(`Os números não são iguais! A sua soma é ${soma} e é menor que 10`)
    }else if (n1 !== n2 && soma >20){
       alert(`Os números não são iguais! A sua soma é ${soma} e é maior que 20`)
    }else if (n1 === n2 && soma <20 && soma > 10){
        alert(`Os números são iguais! A sua soma é ${soma} e é maior que 10 e menor que 20`);
    }else if (n1 !== n2 && soma <20 && soma > 10){
        alert(`Os números não são iguais! A sua soma é ${soma} e é maior que 10 e menor que 20`)
    }

}

operadores();

/* //Resposta do exercicio 
function comparaNumeros(num1, num2) {
	const primeiraFrase = criaPrimeiraFrase(num1, num2);
	const segundaFrase = criaSegundaFrase(num1, num2);

	return `${primeiraFrase} ${segundaFrase}`;
}

function criaPrimeiraFrase(num1, num2) {
	let primeiraFrase = `Os números ${num1} e ${num2}`;
	let simNao = 'não';

	if (num1 === num2) {
		simNao = '';
	}

	return `${primeiraFrase} ${simNao} são iguais.`;
}

function criaSegundaFrase(num1, num2) {
	const soma = num1 + num2;
	let comparaDez = 'menor';
	let comparaVinte = 'menor';

	if (soma > 10) {
		comparaDez = 'maior';
	}

	if (soma > 20) {
		comparaVinte = 'maior';
	}

	return `Sua soma é ${soma}, que é ${comparaDez} do que 10 e ${comparaVinte} do que 20.`;
}

console.log(comparaNumeros(10, 10));*/