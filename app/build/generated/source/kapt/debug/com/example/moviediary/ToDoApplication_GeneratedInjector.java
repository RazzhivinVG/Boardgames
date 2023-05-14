package com.example.moviediary;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;
import javax.annotation.Generated;

@OriginatingElement(
    topLevelClass = ToDoApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
@Generated("dagger.hilt.android.processor.internal.androidentrypoint.InjectorEntryPointGenerator")
public interface ToDoApplication_GeneratedInjector {
  void injectToDoApplication(ToDoApplication toDoApplication);
}
