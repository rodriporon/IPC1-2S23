import express from 'express'
import { findUser, getPatiens } from './data/users.js'

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
export default router