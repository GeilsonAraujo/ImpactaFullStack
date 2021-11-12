export class Produto{
    //Criando o model domain
    constructor(
        idProduto: number, 
        nomeProduto: string, 
        precoProduto:number
        )
        {
            this.idProduto = idProduto;
            this.nomeProduto = nomeProduto;
            this.precoProduto = precoProduto;
        }
        idProduto:number;
        nomeProduto:string;
        precoProduto:number;
}