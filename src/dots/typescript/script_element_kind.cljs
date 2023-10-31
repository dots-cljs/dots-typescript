(ns dots.typescript.script-element-kind
  (:refer-clojure :exclude [keyword])
  (:require ["typescript" :as typescript]))

(def unknown (.-unknown typescript/ScriptElementKind))

(def warning (.-warning typescript/ScriptElementKind))

(def keyword
  "predefined type (void) or keyword (class)"
  (.-keyword typescript/ScriptElementKind))

(def script-element
  "top level script node"
  (.-scriptElement typescript/ScriptElementKind))

(def module-element
  "module foo {}"
  (.-moduleElement typescript/ScriptElementKind))

(def class-element
  "class X {}"
  (.-classElement typescript/ScriptElementKind))

(def local-class-element
  "var x = class X {}"
  (.-localClassElement typescript/ScriptElementKind))

(def interface-element
  "interface Y {}"
  (.-interfaceElement typescript/ScriptElementKind))

(def type-element
  "type T = ..."
  (.-typeElement typescript/ScriptElementKind))

(def enum-element
  "enum E"
  (.-enumElement typescript/ScriptElementKind))

(def enum-member-element (.-enumMemberElement typescript/ScriptElementKind))

(def variable-element
  "Inside module and script only
   const v = .."
  (.-variableElement typescript/ScriptElementKind))

(def local-variable-element
  "Inside function"
  (.-localVariableElement typescript/ScriptElementKind))

(def function-element
  "Inside module and script only
   function f() { }"
  (.-functionElement typescript/ScriptElementKind))

(def local-function-element
  "Inside function"
  (.-localFunctionElement typescript/ScriptElementKind))

(def member-function-element
  "class X { [public|private]* foo() {} }"
  (.-memberFunctionElement typescript/ScriptElementKind))

(def member-get-accessor-element
  "class X { [public|private]* [get|set] foo:number; }"
  (.-memberGetAccessorElement typescript/ScriptElementKind))

(def member-set-accessor-element (.-memberSetAccessorElement typescript/ScriptElementKind))

(def member-variable-element
  "class X { [public|private]* foo:number; }
   interface Y { foo:number; }"
  (.-memberVariableElement typescript/ScriptElementKind))

(def constructor-implementation-element
  "class X { constructor() { } }
   class X { static { } }"
  (.-constructorImplementationElement typescript/ScriptElementKind))

(def call-signature-element
  "interface Y { ():number; }"
  (.-callSignatureElement typescript/ScriptElementKind))

(def index-signature-element
  "interface Y { []:number; }"
  (.-indexSignatureElement typescript/ScriptElementKind))

(def construct-signature-element
  "interface Y { new():Y; }"
  (.-constructSignatureElement typescript/ScriptElementKind))

(def parameter-element
  "function foo(*Y*: string)"
  (.-parameterElement typescript/ScriptElementKind))

(def type-parameter-element (.-typeParameterElement typescript/ScriptElementKind))

(def primitive-type (.-primitiveType typescript/ScriptElementKind))

(def label (.-label typescript/ScriptElementKind))

(def alias (.-alias typescript/ScriptElementKind))

(def const-element (.-constElement typescript/ScriptElementKind))

(def let-element (.-letElement typescript/ScriptElementKind))

(def directory (.-directory typescript/ScriptElementKind))

(def external-module-name (.-externalModuleName typescript/ScriptElementKind))

(def jsx-attribute
  "<JsxTagName attribute1 attribute2={0} />"
  (.-jsxAttribute typescript/ScriptElementKind))

(def string
  "String literal"
  (.-string typescript/ScriptElementKind))

(def link
  "Jsdoc @link: in `{@link C link text}`, the before and after text \"{@link \" and \"}\""
  (.-link typescript/ScriptElementKind))

(def link-name
  "Jsdoc @link: in `{@link C link text}`, the entity name \"C\""
  (.-linkName typescript/ScriptElementKind))

(def link-text
  "Jsdoc @link: in `{@link C link text}`, the link text \"link text\""
  (.-linkText typescript/ScriptElementKind))
