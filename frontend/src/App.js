import './App.css';
import Home from './components/home/home'
import Form from './components/form/form'
import Result from './components/result/result'

function App() {
  return (
    <div className="App">
      <header className="App-header">
      <Home />
	  <Form />
	  <Result />
      </header>

    </div>
  );
}

export default App;
