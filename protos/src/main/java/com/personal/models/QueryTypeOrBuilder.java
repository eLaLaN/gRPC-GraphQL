// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: graphqlService.proto

package com.personal.models;

public interface QueryTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:QueryType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.WiringInstruction get_wiring_instruction = 1;</code>
   */
  boolean hasGetWiringInstruction();
  /**
   * <code>.WiringInstruction get_wiring_instruction = 1;</code>
   */
  com.personal.models.WiringInstruction getGetWiringInstruction();
  /**
   * <code>.WiringInstruction get_wiring_instruction = 1;</code>
   */
  com.personal.models.WiringInstructionOrBuilder getGetWiringInstructionOrBuilder();

  /**
   * <code>repeated .WiringInstruction get_wiring_instructions = 2;</code>
   */
  java.util.List<com.personal.models.WiringInstruction> 
      getGetWiringInstructionsList();
  /**
   * <code>repeated .WiringInstruction get_wiring_instructions = 2;</code>
   */
  com.personal.models.WiringInstruction getGetWiringInstructions(int index);
  /**
   * <code>repeated .WiringInstruction get_wiring_instructions = 2;</code>
   */
  int getGetWiringInstructionsCount();
  /**
   * <code>repeated .WiringInstruction get_wiring_instructions = 2;</code>
   */
  java.util.List<? extends com.personal.models.WiringInstructionOrBuilder> 
      getGetWiringInstructionsOrBuilderList();
  /**
   * <code>repeated .WiringInstruction get_wiring_instructions = 2;</code>
   */
  com.personal.models.WiringInstructionOrBuilder getGetWiringInstructionsOrBuilder(
      int index);
}
