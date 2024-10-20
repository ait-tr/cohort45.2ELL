let players = [
  { name: 'Alex', height: 190, weight: 85, sport: 'rugby' },
  { name: 'Boris', height: 180, weight: 75, sport: 'football' },
  { name: 'Vladimir', height: 175, weight: 70, sport: 'hockey' },
  { name: 'George', height: 185, weight: 80, sport: 'rugby' },
  { name: 'Dmitry', height: 170, weight: 65, sport: 'hockey' },
  { name: 'Eugene', height: 195, weight: 90, sport: 'football' },
  { name: 'Zachary', height: 188, weight: 82, sport: 'rugby' },
  { name: 'Ivan', height: 182, weight: 77, sport: 'football' },
  { name: 'Kirill', height: 178, weight: 73, sport: 'hockey' },
  { name: 'Leonid', height: 192, weight: 87, sport: 'rugby' },
  { name: 'Michael', height: 176, weight: 71, sport: 'hockey' },
  { name: 'Nicholas', height: 198, weight: 93, sport: 'football' },
  { name: 'Oleg', height: 186, weight: 79, sport: 'rugby' },
  { name: 'Paul', height: 174, weight: 69, sport: 'hockey' },
  { name: 'Roman', height: 184, weight: 78, sport: 'football' },
];

const updatedPlayers = players.map(
    
    (player) => (
        {
  ...player,
  goals: Math.floor(Math.random() * 21),
}

)

);

console.log(updatedPlayers);

// Классная работа. Отсортировать в массиве обьекты по возрастающей (значение в свойстве order)
const links = [
    {
        text: "Home",
        url: "/home",
        order: 1
    },
    {
        text: "About Us",
        url: "/about",
        order: 5
    },
    {
        text: "Services",
        url: "/services",
        order: 4
    },
    {
        text: "Contact",
        url: "/contact",
        order: 3
    },
    {
        text: "Blog",
        url: "/blog",
        order: 2
    }
];

// const arr = [ 1, 2, 3];
// const obj = { a: 1, b: 2 };

// [...[ 1, 2, 3]]
// {...obj}

const sortedArray = [...links].sort(

(a, b) => {
    return a.order - b.order
}

);

console.log(sortedArray);
