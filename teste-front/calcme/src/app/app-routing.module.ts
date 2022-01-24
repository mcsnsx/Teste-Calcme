import { CadastrarComponent } from './cadastrar/cadastrar.component';
import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";

const routes: Routes = [

    {path: '', redirectTo:'cadastrar', pathMatch: 'full'},

    {path: 'cadastrar', component:CadastrarComponent}

];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})

export class AppRoutingModule{}