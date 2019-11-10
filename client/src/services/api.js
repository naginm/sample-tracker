// setup something that helps to connect the backend services like hitting urls

import axios from 'axios'

export default () => {
  return axios.create({
    baseURL: `http://localhost:8082/`
  })
}
