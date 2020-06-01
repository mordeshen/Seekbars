package com.occano.di

import com.occano.di.auth.AuthComponent
import com.occano.di.main.MainComponent
import dagger.Module

@Module(
    subcomponents = [
        AuthComponent::class,
        MainComponent::class
    ]
)
class SubComponentsModule