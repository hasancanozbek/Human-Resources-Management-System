import axios from "axios";


export default class JobpostingService {

    getJobPostings() {
        return axios.get("http://localhost:8080/api/employer/findByActiveJobPostings")
    }
}
