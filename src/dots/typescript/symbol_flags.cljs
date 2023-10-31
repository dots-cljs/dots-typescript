(ns dots.typescript.symbol-flags
  (:refer-clojure :exclude [namespace transient type])
  (:require ["typescript" :as typescript]))

(def none (.-None typescript/SymbolFlags))

(def function-scoped-variable (.-FunctionScopedVariable typescript/SymbolFlags))

(def block-scoped-variable (.-BlockScopedVariable typescript/SymbolFlags))

(def property (.-Property typescript/SymbolFlags))

(def enum-member (.-EnumMember typescript/SymbolFlags))

(def function (.-Function typescript/SymbolFlags))

(def class (.-Class typescript/SymbolFlags))

(def interface (.-Interface typescript/SymbolFlags))

(def const-enum (.-ConstEnum typescript/SymbolFlags))

(def regular-enum (.-RegularEnum typescript/SymbolFlags))

(def value-module (.-ValueModule typescript/SymbolFlags))

(def namespace-module (.-NamespaceModule typescript/SymbolFlags))

(def type-literal (.-TypeLiteral typescript/SymbolFlags))

(def object-literal (.-ObjectLiteral typescript/SymbolFlags))

(def method (.-Method typescript/SymbolFlags))

(def constructor (.-Constructor typescript/SymbolFlags))

(def get-accessor (.-GetAccessor typescript/SymbolFlags))

(def set-accessor (.-SetAccessor typescript/SymbolFlags))

(def signature (.-Signature typescript/SymbolFlags))

(def type-parameter (.-TypeParameter typescript/SymbolFlags))

(def type-alias (.-TypeAlias typescript/SymbolFlags))

(def export-value (.-ExportValue typescript/SymbolFlags))

(def alias (.-Alias typescript/SymbolFlags))

(def prototype (.-Prototype typescript/SymbolFlags))

(def export-star (.-ExportStar typescript/SymbolFlags))

(def optional (.-Optional typescript/SymbolFlags))

(def transient (.-Transient typescript/SymbolFlags))

(def assignment (.-Assignment typescript/SymbolFlags))

(def module-exports (.-ModuleExports typescript/SymbolFlags))

(def enum (.-Enum typescript/SymbolFlags))

(def variable (.-Variable typescript/SymbolFlags))

(def value (.-Value typescript/SymbolFlags))

(def type (.-Type typescript/SymbolFlags))

(def namespace (.-Namespace typescript/SymbolFlags))

(def module (.-Module typescript/SymbolFlags))

(def accessor (.-Accessor typescript/SymbolFlags))

(def function-scoped-variable-excludes (.-FunctionScopedVariableExcludes typescript/SymbolFlags))

(def block-scoped-variable-excludes (.-BlockScopedVariableExcludes typescript/SymbolFlags))

(def parameter-excludes (.-ParameterExcludes typescript/SymbolFlags))

(def property-excludes (.-PropertyExcludes typescript/SymbolFlags))

(def enum-member-excludes (.-EnumMemberExcludes typescript/SymbolFlags))

(def function-excludes (.-FunctionExcludes typescript/SymbolFlags))

(def class-excludes (.-ClassExcludes typescript/SymbolFlags))

(def interface-excludes (.-InterfaceExcludes typescript/SymbolFlags))

(def regular-enum-excludes (.-RegularEnumExcludes typescript/SymbolFlags))

(def const-enum-excludes (.-ConstEnumExcludes typescript/SymbolFlags))

(def value-module-excludes (.-ValueModuleExcludes typescript/SymbolFlags))

(def namespace-module-excludes (.-NamespaceModuleExcludes typescript/SymbolFlags))

(def method-excludes (.-MethodExcludes typescript/SymbolFlags))

(def get-accessor-excludes (.-GetAccessorExcludes typescript/SymbolFlags))

(def set-accessor-excludes (.-SetAccessorExcludes typescript/SymbolFlags))

(def accessor-excludes (.-AccessorExcludes typescript/SymbolFlags))

(def type-parameter-excludes (.-TypeParameterExcludes typescript/SymbolFlags))

(def type-alias-excludes (.-TypeAliasExcludes typescript/SymbolFlags))

(def alias-excludes (.-AliasExcludes typescript/SymbolFlags))

(def module-member (.-ModuleMember typescript/SymbolFlags))

(def export-has-local (.-ExportHasLocal typescript/SymbolFlags))

(def block-scoped (.-BlockScoped typescript/SymbolFlags))

(def property-or-accessor (.-PropertyOrAccessor typescript/SymbolFlags))

(def class-member (.-ClassMember typescript/SymbolFlags))
