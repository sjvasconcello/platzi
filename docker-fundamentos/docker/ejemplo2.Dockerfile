FROM python:3.12-alpine

WORKDIR /app

COPY api_ejemplo/requirements.txt requirements.txt

# Instala todo los requerimientos de la app
RUN pip install -r requirements.txt

# Se guarda en la carperta app
COPY ./api_ejemplo .

CMD [ "python", "-m", "flask", "run", "--host=0.0.0.0" ]
