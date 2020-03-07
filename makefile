.PHONY:
run:
	docker-compose up -d	
exec:
	docker exec -it mongodb /bin/bash
down:
	docker-compose down 
