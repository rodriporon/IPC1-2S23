import express from 'express'
import bodyParser from 'body-parser'
import cors from 'cors'
import routes from './routes.js'

const server = express()
const PORT = 4000

server.use(bodyParser.json())
server.use(cors())

server.use('/', routes)

server.listen(PORT, () => {
    console.log(`Server running on port ${PORT}`)
})

