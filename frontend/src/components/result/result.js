import React from 'react';
import axios from "axios";

const url = 'http://localhost:8080/array'
let result = false
let response = null

export default function Result() {
  const [post, setPost] = React.useState(null);

  React.useEffect(() => {
    axios.get(url).then((response) => {
      setPost(response.data);
	  console.log(response.data);
	  while (response == null) {
		  if (response.data == true) {
			result = true
		  } else {
			result = false
		  }
	  }
    });
  }, []);
  
  return (
    <div>
		<div className="half">
			{result == false ? (<div>False</div>) : (<div><h3>True</h3></div>)}
		</div>
    </div>
  );
}