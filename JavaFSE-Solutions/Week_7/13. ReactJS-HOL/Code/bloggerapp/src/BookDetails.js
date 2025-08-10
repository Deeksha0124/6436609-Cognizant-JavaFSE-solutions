import React from 'react';

export default function BookDetails({ books }) {
  if (books.length === 0) {
    return <h3>No Books Available</h3>;  
  }

  return (
    <div>
      <h1>Book Details</h1>
      {books.map(book => (
        <div key={book.id}>
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </div>
  );
}
