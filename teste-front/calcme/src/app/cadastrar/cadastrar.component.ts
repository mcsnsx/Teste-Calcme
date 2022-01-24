import { AuthService } from './../service/auth.service';
import { Postagem } from './../model/Postagem';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cadastrar',
  templateUrl: './cadastrar.component.html',
  styleUrls: ['./cadastrar.component.css']
})
export class CadastrarComponent implements OnInit {

  postagem: Postagem = new Postagem

  constructor(
    private authService: AuthService,
    private router: Router
  ) { }

  ngOnInit() {
    window.scroll(0,0)
  }

  enviar(){
    if(this.postagem.nome == null ){
      alert('O campo "Nome" é obrigatório!')
    }
    if(this.postagem.email == null ){
      alert('O campo "Email" é obrigatório!')
    }
    if(this.postagem.telefone == null ){
      alert('O campo "Telefone" é obrigatório!')
    } else {
      alert('Informações enviadas com sucesso!')
      this.authService.cadastrar(this.postagem).subscribe((resp: Postagem) =>{
        this.postagem = resp
        this.router.navigate(['/cadastrar'])
        
      })
    }
  }
  

}
