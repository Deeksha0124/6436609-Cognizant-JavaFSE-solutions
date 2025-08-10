// src/App.js
import React, { useState } from 'react';
import './App.css';

function App() {
  const [count, setCount] = useState(0);
  const [amount, setAmount] = useState('');
  const [convertedAmount, setConvertedAmount] = useState(null);

  const increment = () => {
    setCount(count + 1);
    sayHello();
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayHello = () => {
    console.log('Hello! This is the increment message.');
  };

  const sayWelcome = (message) => {
    alert(message);
  };

  const handleClick = () => {
    alert('I was clicked');
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const conversionRate = 0.011; // 1 INR ≈ 0.011 EUR
    const converted = (parseFloat(amount) * conversionRate).toFixed(2);
    setConvertedAmount(converted);
  };

  return (
    <div className="app-container">
      <h1>Event Examples App</h1>

      <div className="section">
        <h2>Counter: {count}</h2>
        <div className="button-group">
          <button onClick={increment}>Increment</button>
          <button onClick={decrement}>Decrement</button>
        </div>
      </div>

      <div className="section">
        <h2>Say Welcome</h2>
        <div className="button-group">
          <button onClick={() => sayWelcome("Welcome!")}>Say Welcome</button>
        </div>
      </div>

      <div className="section">
        <h2>Synthetic Event Example</h2>
        <div className="button-group">
          <button onClick={handleClick}>Click Me</button>
        </div>
      </div>

      <div className="section">
        <h2>Currency Converter</h2>
        <form onSubmit={handleSubmit}>
          <div className="currency-input">
            <input
              type="number"
              placeholder="Enter amount in INR"
              value={amount}
              onChange={(e) => setAmount(e.target.value)}
            />
            <button type="submit">Convert</button>
          </div>
        </form>
        {convertedAmount && (
          <p className="result-text">Converted Amount in Euro: €{convertedAmount}</p>
        )}
      </div>
    </div>
  );
}

export default App;
