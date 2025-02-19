import React, { useEffect, useState } from 'react';

function App() {
  const [message, setMessage] = useState('');

  useEffect(() => {
    fetch('/api')
      .then(res => res.text())
      .then(setMessage)
      .catch(console.error);
  }, []);

  return (
    <div>
      <h1>Demo App</h1>
      <p>{message}</p>
    </div>
  );
}

export default App;