import React, { Component } from 'react';
import axios from "axios"; 

class Form extends Component {
  state = {
    string: ''
  };
/* This is where the magic happens 
*/
handleSubmit = event => {
    event.preventDefault();
    const array = {stringArray: this.state.string}
    const url = 'http://localhost:8080/array'
	
	axios({method: 'post',
	url: url,
	headers: {},
	data: array })
      .then(res=>{
        console.log(res);
        console.log(res.data);
      })
  }
handleChange = event =>{
    this.setState({ string: event.target.value});
  }
render() {
    return (
      <div>
        <form onSubmit = { this.handleSubmit }>
            <input type = "text" placeholder="Array" className="form-control" onChange= {this.handleChange}/>
          <button type = "submit" className="btn btn-primary"> Testar </button>
        </form>
    </div>
    );
  }
}
export default Form;