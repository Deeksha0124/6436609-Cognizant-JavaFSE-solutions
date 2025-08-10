import React from 'react';

const IndianPlayers = () => {
  const team = [
    'Virat Kohli', 'Rohit Sharma', 'KL Rahul', 'Shubman Gill',
    'Hardik Pandya', 'Ravindra Jadeja', 'R Ashwin', 'Bumrah'
  ];

  const oddTeam = team.filter((_, index) => index % 2 !== 0);
  const evenTeam = team.filter((_, index) => index % 2 === 0);
  const T20players = ['Dhoni', 'Raina'];
  const RanjiTrophyPlayers = ['Prithvi Shaw', 'Manoj Tiwary'];
  const allPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team Players:</h2>
      <ul>
        {oddTeam.map((player, i) => (
          <li key={i}>{player}</li>
        ))}
      </ul>

      <h2>Even Team Players:</h2>
      <ul>
        {evenTeam.map((player, i) => (
          <li key={i}>{player}</li>
        ))}
      </ul>

      <h2>All Players (T20 + Ranji Trophy):</h2>
      <ul>
        {allPlayers.map((player, i) => (
          <li key={i}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
