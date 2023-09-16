#These are the endpoints and how to call the API.

GET All Players
http://localhost:8080/players

GET One Player
http://localhost:8080/players/{id}

POST (Create) Player
http://localhost:8080/players

{
        "firstName": "Alfred",
        "lastName": "Lim",
        "footballclub": "LiverPool",
        "playerposition": "Midfielder",
        "age": 28,
        "nationality": "Singaporean"
}

PUT (Update)
http://localhost:8080/players/{id}

{
        "firstName": "Alfred",
        "lastName": "Lim",
        "footballclub": "Manchester United",
        "playerposition": "Striker",
        "age": 28,
        "nationality": "Singaporean"
}
        
DELETE 
http://localhost:8080/players/{id}

GET Search via PlayerName 
http://localhost:8080/players/search?playerName=Alfred





