# -*- coding: utf-8 -*-
from wsgiref.simple_server import make_server
from pyramid.config import Configurator
from pyramid.response import Response

#### Primeiro programa com Pyramid

def app(request):
    return Response("Ola %(nome)s" % request.matchdict)

if __name__ == '__main__':
    with Configurator() as configura:
        configura.add_route('/', '{nome}')
        configura.add_view(app, route_name='/')
        programa = configura.make_wsgi_app()
    servidor = make_server('0.0.0.0', 8089, programa)
    servidor.serve_forever()