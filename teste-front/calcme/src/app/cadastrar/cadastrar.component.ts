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
    if(this.postagem.nome || this.postagem.email || this.postagem.telefone == null ){
      alert('Todos os campos são obrigatórios!')
    } else {
      this.authService.cadastrar(this.postagem).subscribe((resp: Postagem) =>{
        this.postagem = resp
        this.router.navigate(['/cadastrar'])
        alert('Informações enviadas com sucesso!')
      })
    }
  }

}
//origin