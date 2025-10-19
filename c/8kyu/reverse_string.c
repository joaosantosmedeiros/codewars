#include<stdlib.h>
#include<string.h>

char *strrev (char *string){                                                                           
    int strLength = strlen(string);                                                                    
    char* reversed = string;                                                                 
                                                                                                       
    for(int i = 0; i < strLength / 2 ; i ++ ){                                                         
        char temp = reversed[i];                                                                       
        reversed[i] = reversed[strLength - i - 1];                                                     
        reversed[strLength - i - 1] = temp;                                                            
    }                                                                                                  
                                                                                                       
    return reversed;                                                                                   
}      
