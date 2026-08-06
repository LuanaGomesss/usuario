package com.javanauta.usuario.business;

import com.javanauta.usuario.business.converter.UsuarioConverter;
import com.javanauta.usuario.business.dto.request.UsuarioRequestDTO;
import com.javanauta.usuario.infrastructure.entity.Usuario;
import com.javanauta.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioRequestDTO salvaUsuario (UsuarioRequestDTO usuarioDTO){
       Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);

       return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }
}
