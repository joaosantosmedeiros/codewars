//https://www.codewars.com/kata/5556282156230d0e5e000089
#include <stdlib.h>
#include <string.h>
#include <stdio.h>

char *dna_to_rna(const char *dna){
  char* rna;
  asprintf(&rna, "%s", dna);
  int len = strlen(dna);
      
  for(int i = 0; i < len; i ++) {
    if(rna[i] == 'T') rna[i] = 'U';
  }
  
  return rna;
}
