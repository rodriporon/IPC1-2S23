const medicinas = [
    {
        id: 1,
        nombre: 'Paracetamol',
        descripcion: 'Medicamento para el dolor',
        precio: 10,
        cantidad: 100,
    },
    {
        id: 2,
        nombre: 'Ibuprofeno',
        descripcion: 'Medicamento para el dolor',
        precio: 200,
        cantidad: 100,
    }
]

const getMedicinas = () => {
    return medicinas
}

export { getMedicinas }