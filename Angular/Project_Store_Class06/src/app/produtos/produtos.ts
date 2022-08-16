export interface IProduto {
    id: number;
    descricao: string;
    preco: number;
    quantidadeEstoque: number;
    descricaoPreco: string;
    imagem: string;
    
}

export interface IProdutoCarrinho extends IProduto {
    quantidade: number;

}

export const produtos: IProduto [] = [
    { id: 1, descricao: "Pão de Queijo colorido", preco: 35.00, descricaoPreco: "Sob encomenda", imagem: "/assets/pao_queijo_colorido.JPG", quantidadeEstoque: 10},
    { id: 2, descricao: "Beijinho Colorido Naturalmente", preco: 65.50, descricaoPreco: "Sob encomenda", imagem: "/assets/beijinho.JPG", quantidadeEstoque: 10},
    { id: 3, descricao: "Biscoitos Coloridos Naturalmente", preco: 12.00, descricaoPreco: "Sob encomenda", imagem: "/assets/biscoitos_coloridos.JPG", quantidadeEstoque: 10},
    { id: 4, descricao: "Bolo de coco azul", preco: 8.00, descricaoPreco: "Sob encomenda", imagem: "/assets/bolo_coco_azul.JPG", quantidadeEstoque: 10},
    { id: 5, descricao: "Gnochi de Batata Colorido Naturalmente", preco: 50.00, descricaoPreco: "Sob encomenda", imagem: "/assets/gnochi_colorido.JPG", quantidadeEstoque: 10 },
    { id: 6, descricao: "Macarrão Colorido Naturalmente", preco: 50.00, descricaoPreco: "Sob encomenda", imagem: "/assets/macarrao_colorido.JPG", quantidadeEstoque: 10 },
    { id: 7, descricao: "Preparo para panqueca colorida", preco: 20.00, descricaoPreco: "Sob encomenda", imagem: "/assets/panqueca.JPG", quantidadeEstoque: 10},
    { id: 8, descricao: "Pão de Beterraba e Catupiry Porquinho", preco: 5.00, descricaoPreco: "Sob encomenda", imagem: "/assets/pao_porquinho.JPG", quantidadeEstoque: 30 },
    { id: 9, descricao: "Raviolli Gorgonzola", preco: 60.00, descricaoPreco: "Sob encomenda", imagem: "/assets/raviolli_gorgonzola.JPG", quantidadeEstoque: 10 },
]