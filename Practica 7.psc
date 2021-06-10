Algoritmo Ruleta
	ceros=0
	pares=0
	impares=0
	porcentajePares=0
	porcentajeImpares=0
	procentajeCeros=0
	Para k<-1 Hasta 15 Con Paso 1 Hacer
		num=Aleatorio(0,36)
		Escribir "Numero Aleatorio es " num
		Si num=0 Entonces
			ceros=ceros+1
		SiNo
			Si num mod 2=0 Entonces
				pares=pares+1
			SiNo
				impares=impares+1
			FinSi
		FinSi
	Fin Para
	porcentajePares=(pares*100)/15
	porcentajeImpares=(impares*100)/15
	porcentajeCeros=(ceros*100)/15
	Escribir ceross
	Escribir "El Porcentaje de números pares es " porcentajePares "%"
	Escribir "El Porcentaje de números impares es " porcentajeImpares "%"
	Escribir "El Porcentaje de ceros es " porcentajeCeros "%"
FinAlgoritmo
