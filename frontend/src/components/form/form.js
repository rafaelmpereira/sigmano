import { useState } from 'react';
import ReactDOM from 'react-dom/client';

function Form() {
  const [name, setName] = useState("");

  const handleSubmit = (event) => {
    event.preventDefault();
  }

  return (
    <form onSubmit={handleSubmit}>
      <label>
        <input 
          type="text" className="form-control"
          value={name}
          onChange={(e) => setName(e.target.value)}
        />
      </label>
      <button type="submit" className="btn btn-primary">Enviar</button>
    </form>
  )
}

//const root = ReactDOM.createRoot(document.getElementById('root'));
//root.render(<Form />);
export default Form;