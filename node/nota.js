let nomePessoa, nota1, nota2, media;

exports.setNomePessoa = function (fnome){
    nomePessoa = fnome;
};
exports.setNota1 = function (fnota1){
    nota1 = fnota1;
}
exports.setNota2 = function (fnota2){
    nota2 = fnota2;
}
exports.setMedia = function (fmedia){
    fmedia = (fnota1 + fnota2) / 2; 
    media = fmedia;
}
