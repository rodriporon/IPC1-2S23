import express from 'express'
import { findUser, getPatiens } from './data/users.js'
import { getMedicinas } from './data/medicinas.js'
import { agregarCompraDeMedicina } from './data/recetas.js'

const router = express.Router()

router.get('/', (req, res) => {
    res.send('Hola')
})

router.post('/login', (req, res) => {
    /* 
    const username = req.body.username
    const password = req.body.password 
    */

    const { username, password } = req.body

    const user = findUser(username, password)

    if (user) {
        res.json({ message: 'Usuario logueado con éxito', user })
    } else {
        res.status(401).json({ message: 'Usuario o contraseña incorrectos' })
    }
})

router.get('/patients', (req, res) => {
    const patients = getPatiens()
    res.json(patients)
})

router.get('/medicinas', (req, res) => {
    const medicinas = getMedicinas()
    res.json(medicinas)
})

router.post('/compra-medicina', (req, res) => {
    const { idMedicina, cantidad, idPaciente } = req.body

    agregarCompraDeMedicina({
        idMedicina,
        cantidad,
        idPaciente
    })

    res.json({ message: 'Compra de medicina agregada con éxito' })
})


export default router