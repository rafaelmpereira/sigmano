import React, { Component } from 'react';
import axios from "axios"; 

class Form extends Component {
  state = {
    string: ''
  };
  handleSend = event => {
    event.preventDefault();
    const array = {value: this.state.string}
    const url = 'http://localhost:8080/array'
	
	axios({method: 'post',
	url: url,
	headers: {},
	data: array })
      .then(response=>{
        console.log(response.data);
      })
  }
  handleResult = event => {
    event.preventDefault();
    const url = 'http://localhost:8080/array'
    
    axios.get(url).then((response) => {
	  console.log(response.data);
  })
  }

handleChange = event =>{
    this.setState({ string: event.target.value});
  }

render() {
    return (
      <div>
        <form>
            <input type = "text" placeholder="Array" className="form-control" onChange= {this.handleChange}/>
          <button type = "submit" onClick={this.handleSend} className="btn btn-primary"> Enviar </button>
		  <button type = "submit" onClick={this.handleResult} className="btn btn-secondary"> Receber </button>
        </form>
    </div>
    );
  }
}
export default Form;