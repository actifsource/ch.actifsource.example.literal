package ch.actifsource.example.literal.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Root extends DynamicResource implements IRoot {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoot> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoot>() {
    
    @Override
    public IRoot create() {
      return new Root();
    }
    
    @Override
    public IRoot create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Root(resourceRepository, resource);
    }
  
  };

  public Root() {
    super(IRoot.TYPE_ID);
  }
  
  public Root(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRoot.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectHexBitDecimalLiteral() {
    return _getListAttribute(java.lang.String.class, ch.actifsource.example.literal.generic.GenericPackage.Root_hexBitDecimalLiteral);
  }
    
  public void setHexBitDecimalLiteral(java.util.List<java.lang.String> hexBitDecimalLiteral) {
     _setListAttribute(ch.actifsource.example.literal.generic.GenericPackage.Root_hexBitDecimalLiteral, hexBitDecimalLiteral);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Root setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, ch.actifsource.example.literal.generic.GenericPackage.Root_hexBitDecimalLiteral, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e0ef9cfb-43d8-11ed-975d-cbc029e0e53b,ObwDmKCsaZhgUqgGfdf+QABy2tw=] */
