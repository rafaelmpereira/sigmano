import React from 'react';
import axios from "axios";

const url = 'http://localhost:8080/array'

export default function Result() {
  const [post, setPost] = React.useState(null);

  React.useEffect(() => {
    axios.get(url).then((response) => {
      setPost(response.data);
	  console.log(response.data);
    });
  }, []);

  if (!post) return null;

  return (
    <div>
		<form onSubmit = {React.useEffect}>
		  <button type = "submit" className="btn btn-secondary"> Checar DNA </button>
		</form>
		<h1>{post.title}</h1>
		<p>{post.body}</p>
    </div>
  );
}