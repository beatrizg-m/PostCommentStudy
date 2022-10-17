package Entities;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Post{

    //Como nosso post possui vários comentários, nos criamos uma lista de comentários.//

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();

    public Post(){

    }

    //Não se coloca a lista no construstor. //

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    //Após definir os atributos e os construtores fazemos os getrs and sters. Todos com exeção do setComments.//

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    //Não faria sentido ter um setComments pois o setComments receberia outra lista que não é o que queremos. Ao em vez disso se faz um comments.add para aidiconar um comentário a lista e não alterar a lista toda. Sendo assim criamos o void abaixo.// 

    public void addComment(Comment comment){
        comments.add(comment);
    }

    //Lembrando passo a passo desse add nele nós estamos criando um método public do tipo void, chamamos ele de addComment e como parametro passamos o tipo Comment com o objeto comment. E por fim chamo a lista comments boto para add e passo como paramentro o comment. //
    
    public void removeComment(Comment comment){
        comments.remove(comment);
    }

    //Esse método segue a  mesma logica do add mas em vez de adicionar estamos removendo. //


    // Por se tratar de uma String muito grande, se eu montar uma string enorme somente com concatenaçao de strings vou acabar ocupando muito espaço de memoria e com isso o programa ficará muito lento, com a classe StringBuilder consigo fazer isso de forma mais otimizada. Representada abaixo.//

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes -");
        sb.append(sdf.format(moment)+ "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        for (Comment c : comments){
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }

}