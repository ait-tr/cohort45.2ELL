use("school_db");

// CRUD (CREATE READ UPDATE DELETE)
// sql: INSERT INTO users (name) VALUES ("Alex")
// db.users.insertOne({
//     name: "Alex"
// })

// sql: INSERT INTO users (name, age) VALUES ("Alex", 35)
// db.users.insertOne({
//     name: "Alex",
//     age: 35
// });

// sql: INSERT INTO users (name, age, address) VALUES ("Alex", 35, "Berlin")
// db.users.insertOne({
//     name: "Alex",
//     age: 35,
//     address: {
//         city: "Berlin"
//     }
// });

// sql: INSERT INTO users (name, age) VALUES ("Andrew", 25), ("Anna", 32)
// db.users.insertMany([
//     { name: "Andrew", age: 25 },
//     { name: "Anna", age: 32 }
// ]);

// sql: INSERT INTO users (name, age, hobby) VALUES ("John", 20, "rock'n'roll, snowboard, surfing")
// db.users.insertOne({
//     name: "John",
//     age: 20,
//     hobby: ["rock'n'roll", "snowboard", "surfing"]
// });

// sql: SELECT * FROM users
// Чтение всех документов коллекции
// db.users.find();

// sql: SELECT * FROM users LIMIT 3
// Чтение первых трёх документов коллекции
// db.users.find().limit(3);

// Чтение всех документов коллекции отсортированных по имени
// (в алфавитном порядке)
// SELECT * FROM users ORDER BY name ASC
// db.users.find().sort({ name: 1 })

// Чтение всех документов коллекции отсортированных по имени
// (в обратном алфавитному порядке)
// SELECT * FROM users ORDER BY name DESC
// db.users.find().sort({ name: -1 })

// Чтение всех документов коллекции отсортированных по имени
// (в обратном алфавитному порядке), а если имена одинаковые, тогда
// сортировка осуществляется по возрасту
// SELECT * FROM users ORDER BY name DESC, age ASC
// db.users.find().sort({ name: -1, age: 1 })

// Чтение всех документов коллекции без первых двух
// SELECT * FROM users OFFSET 2
db.users.find().skip(2);

// Чтение всех документов коллекции, у кого возраст равен 25
// SELECT * FROM users WHERE age = 25
db.users.find({ age: 25 });

// Чтение первого документов коллекции, у кого возраст равен 25
// SELECT * FROM users WHERE age = 25 LIMIT 1
db.users.findOne({ age: 25 });