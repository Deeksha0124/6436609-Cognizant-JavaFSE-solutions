import React from 'react';

export default function BlogDetails({ show }) {
  return show ? ( // Ternary operator method
    <div>
      <h1>Blog Details</h1>
      <h3>React Learning</h3>
      <p>Welcome to learning React!</p>
      <h3>Installation</h3>
      <p>You can install React from npm.</p>
    </div>
  ) : (
    <h3>Blog is Hidden</h3>
  );
}
