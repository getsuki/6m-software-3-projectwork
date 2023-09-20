To use swagger UI
http://localhost:8080/swagger-ui/index.html#/

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

POST Statistics for Player ID 1 
http://localhost:8080/players/1/statistics
{
    "goals": 2,
    "assists": 3,
    "opposition": "Chelsea",
    "matchDate": "2020-02-20"
}




