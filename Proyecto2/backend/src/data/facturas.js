const facturas = []

const agregarFactura = (factura) => {
    facturas.push(factura)
}

const obtenerFacturas = () => {
    return facturas
}

export { agregarFactura, obtenerFacturas}