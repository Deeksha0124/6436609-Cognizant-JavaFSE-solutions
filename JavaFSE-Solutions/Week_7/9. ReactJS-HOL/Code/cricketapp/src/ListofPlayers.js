import React from 'react';

const ListofPlayers = () => {
  const players = [
 { name: 'Virat Kohli', score: 85 },
 { name: 'Rohit Sharma', score: 78 },
{ name: 'Shubman Gill', score: 65 },
{ name: 'KL Rahul', score: 45 },
{ name: 'Hardik Pandya', score: 92 },
{ name: 'Ravindra Jadeja', score: 70 },
{ name: 'R Ashwin', score: 60 },
 { name: 'Shami', score: 50 },
 { name: 'Bumrah', score: 72 },
    { name: 'Surya Kumar', score: 40 },
    { name: 'Ishan Kishan', score: 88 },
  ];
 const below70 = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players:</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>

      <h2>Players with Score Below 70:</h2>
      <ul>
        {below70.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
