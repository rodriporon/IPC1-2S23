const recetas = [

]

const medicinasCompradas = [

]

const agregarReceta = (receta) => {
    recetas.push(receta)
}

const agregarCompraDeMedicina = (compra) => {
    medicinasCompradas.push(compra)
}

export { agregarCompraDeMedicina, agregarReceta, medicinasCompradas, recetas}