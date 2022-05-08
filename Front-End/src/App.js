import 'semantic-ui-css/semantic.min.css'
import { Container } from 'semantic-ui-react';
import './App.css';
import Dashboard from './Layouts/Dashboard';
import Navi from './Layouts/Navi';


function App() {
  return (
    <div className="App">
      <Navi />
      <Container className="mycontainer">
        <Dashboard />
      </Container>
    </div>
  );
}

export default App;
